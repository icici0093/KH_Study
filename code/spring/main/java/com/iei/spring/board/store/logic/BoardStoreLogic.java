package com.iei.spring.board.store.logic;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iei.spring.board.domain.Board;
import com.iei.spring.board.domain.PageInfo;
import com.iei.spring.board.domain.Reply;
import com.iei.spring.board.store.BoardStore;

@Repository
public class BoardStoreLogic implements BoardStore{

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public int selectListCount() {
		return sqlSession.selectOne("boardMapper.selectListCount");
	}

	@Override
	public ArrayList<Board> selectAllList(PageInfo pi) {
		// RowBounds는 쿼리문을 변경하지 않고도 페이징을 처리할 수 있게 해주는 클래스
		// RowBounds의 동작은 offset값과 limit값을 이용해서 동작함 
		// offset값은 변하는 값이고 limit값은 고정값 
		// limit값이 한 페이지당 보여주고 싶은 게시물의 갯수 
		// offset값은 건너뛰어야 할 값임 
		// ex) currentPage가 1일 때 offset값은 0, limit값은 10이 되어 10개값을 보여줌 
		//       currentPage가 2일 때 offset값은 10이 되어서 10개를 건너뛰고 
		//       limit값은 11이 되어 20까지의 10개값을 보여줌 
		//		
		int offset = (pi.getCurrentPage() - 1) * pi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());
		return (ArrayList)sqlSession.selectList("boardMapper.selectAllList", null, rowBounds);
	}

	@Override
	public int addReadCount(int boardNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Board selectOne(int boardNo) {
		Board board = sqlSession.selectOne("boardMapper.selectOne", boardNo);
		return board;
	}

	@Override
	public int insertBoard(Board board) {
		return sqlSession.insert("boardMapper.insertBoard", board);
	}

	@Override
	public int updateBoard(Board board) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBoard(int boardNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Reply> selectAllReply(int boardNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertReply(Reply reply) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateReply(Reply reply) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteReply(Reply reply) {
		// TODO Auto-generated method stub
		return 0;
	}

}
