package com.example.applemart.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

import static javax.persistence.FetchType.*;

@Entity
@Getter @Setter
@Table(name = "trade_history")
public class TradeHistory {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trade_history_id")
    private Long id;

    @ManyToOne(fetch = LAZY) //단방향 연관관계 설계
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = LAZY) //단방향 연관관계 설계
    @JoinColumn(name = "posts_id")
    private Post post;

    @Column(name = "trade_history_created_at")
    private LocalDateTime createdTime;

    @Column(name = "trade_history_updated_at")
    private LocalDateTime updatedTime;
}
