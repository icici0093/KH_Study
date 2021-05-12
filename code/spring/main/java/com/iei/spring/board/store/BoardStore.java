package com.iei.spring.board.store;

import java.util.ArrayList;

import com.iei.spring.board.domain.Board;
import com.iei.spring.board.domain.PageInfo;
import com.iei.spring.board.domain.Reply;

public interface BoardStore {

	public int selectListCount();
	public ArrayList<Board> selectAllList(PageInfo pi);
	public int addReadCount(int boardNo);
	
	public Board selectOne(int boardNo);
	public int insertBoard(Board board);
	public int updateBoard(Board board);
	public int deleteBoard(int boardNo);
	
	public ArrayList<Reply> selectAllReply(int boardNo);
	public int insertReply(Reply reply);
	public int updateReply(Reply reply);
	public int deleteReply(Reply reply);
}
