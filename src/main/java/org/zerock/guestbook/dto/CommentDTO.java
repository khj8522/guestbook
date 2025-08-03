package org.zerock.guestbook.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommentDTO {
    private Long cno;
    private Long gno;
    private String comment;
    private String writer;
    private LocalDateTime regTime, modDate;
}
