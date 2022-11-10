package org.zerock.service.board;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.zerock.domain.board.BoardDto;
import org.zerock.domain.board.PageInfo;
import org.zerock.mapper.board.BoardMapper;
import org.zerock.mapper.board.ReplyMapper;

@Transactional
@Service
public class BoardService {

	@Autowired
	private BoardMapper boardMapper;

	@Autowired
	private ReplyMapper replyMapper;

	public int register(BoardDto board, MultipartFile[] files) {
		// db에 게시물 정보 저장
		int cnt = boardMapper.insert(board);

		for (MultipartFile file : files) {
			if (file != null && file.getSize() > 0) {
				// db에 파일 정보 저장
				boardMapper.insertFile(board.getId(), file.getOriginalFilename());

				// 파일 저장
				// board id 이름의 새폴더 만들기
				File folder = new File(
						"/Users/sunggyu-lim/Desktop/kukbi/study/upload/prj1/board/" + board.getId());
				folder.mkdirs();

				File dest = new File(folder, file.getOriginalFilename());

				try {
					file.transferTo(dest);
				} catch (Exception e) {
					// @Transactional은 RuntimeException에서만 rollback 됨
					e.printStackTrace();
					throw new RuntimeException(e);
				}
			}
		}

		return cnt;
	}

	public List<BoardDto> listBoard(int page, String type, String keyword, PageInfo pageInfo) {
		int records = 10;
		int offset = (page - 1) * records;

		int countAll = boardMapper.countAll(type, "%" + keyword + "%"); // SELECT Count(*) FROM Board
		int lastPage = (countAll - 1) / records + 1;

		int leftPageNumber = (page - 1) / 10 * 10 + 1;
		int rightPageNumber = leftPageNumber + 9;
		rightPageNumber = Math.min(rightPageNumber, lastPage);

		// 이전버튼 유무
		boolean hasPrevButton = page > 10;
		// 다음버튼 유무
		boolean hasNextButton = page <= ((lastPage - 1) / 10 * 10);

		// 이전버튼 눌렀을 때 가는 페이지 번호
		int jumpPrevPageNumber = (page - 1) / 10 * 10 - 9;
		int jumpNextPageNumber = (page - 1) / 10 * 10 + 11;

		pageInfo.setHasPrevButton(hasPrevButton);
		pageInfo.setHasNextButton(hasNextButton);
		pageInfo.setJumpPrevPageNumber(jumpPrevPageNumber);
		pageInfo.setJumpNextPageNumber(jumpNextPageNumber);
		pageInfo.setCurrentPageNumber(page);
		pageInfo.setLeftPageNumber(leftPageNumber);
		pageInfo.setRightPageNumber(rightPageNumber);
		pageInfo.setLastPageNumber(lastPage);

		return boardMapper.list(offset, records, type, "%" + keyword + "%");
	}

	public BoardDto get(int id) {
		// TODO Auto-generated method stub
		return boardMapper.select(id);
	}

	public int update(BoardDto board, MultipartFile[] addFiles, List<String> removeFiles) {
		int boardId = board.getId();

		// removeFiles 에 있는 파일명으로 
		
		if (removeFiles != null) {
			for (String fileName : removeFiles) {
				// 1. File 테이블에서 record 지우기
				boardMapper.deleteFileByBoardIdAndFileName(boardId, fileName);
				// 2. 저장소에 실제 파일 지우기
				String path = "C:\\Users\\user\\Desktop\\study\\upload\\prj1\\board\\" + boardId + "\\" + fileName;
				File file = new File(path);
				
				file.delete();
			}
		}
		for (MultipartFile file : addFiles) {
			if (file != null && file.getSize() > 0) {
				String name = file.getOriginalFilename();
				// File table에 해당파일명 지우기
				boardMapper.deleteFileByBoardIdAndFileName(boardId, name);
				
				// File table에 파일명 추가
				boardMapper.insertFile(boardId, name);
				
				// 저장소에 실제 파일 추가
				File folder = new File("/Users/sunggyu-lim/Desktop/kukbi/study/upload/prj1/board/" + board.getId());
				folder.mkdirs();
				
				File dest = new File(folder, name);
				
				try {
					file.transferTo(dest);
				} catch (Exception e) {
					// @Transactional은 RuntimeException에서만 rollback 됨
					e.printStackTrace();
					throw new RuntimeException(e);
				}
			}
			
		}
		
		
		return boardMapper.update(board);
	}

	public int remove(int id) {
		// 저장소의 파일 지우기
		String path = "/Users/sunggyu-lim/Desktop/kukbi/study/upload/prj1/board/" + id;
		File folder = new File(path);

		File[] listFiles = folder.listFiles();

		if (listFiles != null) {
			for (File file : listFiles) {
				file.delete();
			}
		}

		folder.delete();

		// db 파일 records 지우기
		boardMapper.deleteFileByBoardId(id);

		// 게시물의 댓글들 지우기
		replyMapper.deleteByBoardId(id);

//		int a = 3 / 0; // runtime exception

		// 게시물 지우기
		return boardMapper.delete(id);
	}

}
