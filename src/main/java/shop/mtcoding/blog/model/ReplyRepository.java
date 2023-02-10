package shop.mtcoding.blog.model;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import shop.mtcoding.blog.dto.board.BoardResp.BoardDetailRespDto;
import shop.mtcoding.blog.dto.board.BoardResp.BoardMainRespDto;

import java.util.List;

@Mapper
public interface ReplyRepository {

        public List<Reply> findAll();

        public Board findById(int id);

        public int insert(@Param("commment") String commment,
                        @Param("userId") int userId,
                        @Param("boardId") int boardId);

        public int updateById(@Param("id") int id, @Param("commment") String commment);

        public int deleteById(int id);
}