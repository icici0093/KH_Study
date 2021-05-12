package com.iei.spring.board.service;

import java.util.ArrayList;

import com.iei.spring.board.domain.Board;
import com.iei.spring.board.domain.PageInfo;
import com.iei.spring.board.domain.Reply;

public interface BoardService {
	
	/**
	 * 게시물 전체 수 조회수
	 * @return
	 */
	public int getListCount();
	
	/** javadoc 주석 
	 * 게시판 전체 조회 
	 * @param pi
	 * @return
	 */
	// 이런 주석과는 다름  
	public ArrayList<Board> printAll(PageInfo pi);
	
	/**
	 * 게시판 상세 조회시 조회수 증가 
	 * @param boardNo
	 * @return
	 */
	public int addReadCount(int boardNo);
	
	/**
	 * 게시물 상세 조회  
	 * @param boardNo
	 * @return
	 */
	public Board printOne(int boardNo);
	
	/**
	 * 게시물 등록 
	 * @param board
	 * @return
	 */
	public int registerBoard(Board board);
	
	/**
	 * 게시물 수정 
	 * @param board
	 * @return
	 */
	public int modifyBoard(Board board);
	public int removeBoard(int boardNo); 
	
	/**
	 * 댓글 전체 조회 
	 * @param boardNo
	 * @return
	 */
	public ArrayList<Reply> printAllReply(int boardNo);
	public int registerReply(Reply reply);
	public int modifyReply(Reply reply);
	public int removeReply(int replyNo);
}
