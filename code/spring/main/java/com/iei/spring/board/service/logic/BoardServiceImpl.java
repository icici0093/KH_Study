package com.iei.spring.board.service.logic;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iei.spring.board.domain.Board;
import com.iei.spring.board.domain.PageInfo;
import com.iei.spring.board.domain.Reply;
import com.iei.spring.board.service.BoardService;
import com.iei.spring.board.store.BoardStore;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardStore bStore;
	
	@Override
	public int getListCount() {
		return bStore.selectListCount();
	}

	@Override
	public ArrayList<Board> printAll(PageInfo pi) {
		return bStore.selectAllList(pi);
	}

	@Override
	public int addReadCount(int boardNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Board printOne(int boardNo) {
		Board board = bStore.selectOne(boardNo);
		return board;
	}

	@Override
	public int registerBoard(Board board) {
		return bStore.insertBoard(board);
	}

	@Override
	public int modifyBoard(Board board) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeBoard(int boardNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Reply> printAllReply(int boardNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int registerReply(Reply reply) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyReply(Reply reply) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeReply(int replyNo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
