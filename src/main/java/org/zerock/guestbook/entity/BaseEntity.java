package org.zerock.guestbook.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(value = { AuditingEntityListener.class}) // 엔티티의 상태변화를 감지
// value값은 @CreatedDate 와 @LastModifiedDate 필드를 자동으로 채워줌
@Getter
public abstract class BaseEntity {

    @CreatedDate // 등록일
    @Column(name = "regdate", updatable = false) // 수정시에는 업데이트 안함
    private LocalDateTime regDate;

    @LastModifiedDate // 수정일 ( 수정될때마다 현재 시간이 자동으로 저장)
    @Column(name = "moddate")
    private LocalDateTime modDate;
}
