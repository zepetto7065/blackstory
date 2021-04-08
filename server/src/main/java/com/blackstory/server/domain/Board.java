package com.blackstory.server.domain;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Board {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String content;

    private String writer;

    private LocalDateTime registeredDate;

    private LocalDateTime updatedDate;

    @Column(columnDefinition = "varchar(1) default 'N'")
    private String deleteYn;

}
