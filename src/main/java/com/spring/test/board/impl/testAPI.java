package com.spring.test.board.impl;

import com.spring.test.board.BoardVO;

public class testAPI {

	public static void main(String[] args) {
		BoardDAO boardDAO = new BoardDAO();
		
		BoardVO vo = new BoardVO();
		vo.setTitle("���̺�Ƽ��");
		vo.setWriter("ȫ�浿");
		vo.setContent("���̺�Ƽ�� �׽�Ʈ ��");
		boardDAO.insertBoard(vo);
	}

}
