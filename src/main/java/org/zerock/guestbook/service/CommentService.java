package org.zerock.guestbook.service;

import org.zerock.guestbook.dto.CommentDTO;
import org.zerock.guestbook.entity.Comment;

import java.util.List;

public interface CommentService {
    Long register(Comment comment);
    List<CommentDTO> getList(Long gno);
    void remove(Long cno);
}
