package org.zerock.domain.boardEx;

import lombok.Data;

@Data
public class PageInfoEx {

	private int currentPageNumber;
	private int lastPageNumber;
	private int leftPageNumber;
	private int rightPageNumber;
}
