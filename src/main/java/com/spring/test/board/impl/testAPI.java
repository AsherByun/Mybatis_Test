package com.spring.test.board.impl;

import com.spring.test.board.BoardVO;

public class testAPI {

	public static void main(String[] args) {
		BoardDAO boardDAO = new BoardDAO();
		
		BoardVO vo = new BoardVO();
		vo.setTitle("마이베티스");
		vo.setWriter("홍길동");
		vo.setContent("마이베티스 테스트 중");
		boardDAO.insertBoard(vo);
	}

}
