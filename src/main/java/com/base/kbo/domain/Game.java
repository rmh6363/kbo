package com.base.kbo.domain;

import jakarta.persistence.*;


import java.time.LocalDateTime;

@Entity
@Table(name = "tb_game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tb_game_game_no_seq")
    @SequenceGenerator(name = "tb_game_game_no_seq", sequenceName = "tb_game_game_no_seq", allocationSize = 1)
    private Long gameNo;

    @Column(nullable = false)
    private LocalDateTime gameDt;

    @Column(name = "game_local", nullable = false, length = 100)
    private String gameLocal;

    @Column(name = "game_cnt", nullable = false)
    private Integer gameCnt;

    @Column(name = "game_stime", nullable = false)
    private LocalDateTime gameStime;

    @Column(name = "game_etime", nullable = false)
    private LocalDateTime gameEtime;

    @Column(name = "game_play_time", nullable = false, length = 20)
    private String gamePlayTime;

    @Column(name = "game_double_at", nullable = false)
    private String gameDoubleAt;

    @Column(name = "game_home_nm", nullable = false, length = 20)
    private String gameHomeNm;

    @Column(name = "game_away_nm", nullable = false, length = 20)
    private String gameAwayNm;

    @Column(name = "game_home_result", nullable = false)
    private String gameHomeResult;

    @Column(name = "game_away_result", nullable = false)
    private String gameAwayResult;

    @Column(name = "game_cancel_ty")
    private String gameCancelTy;

    // 기본 생성자
    public Game() {
    }

    // Getter와 Setter
    public Long getGameNo() {
        return gameNo;
    }

    public void setGameNo(Long gameNo) {
        this.gameNo = gameNo;
    }

    public LocalDateTime getGameDt() {
        return gameDt;
    }

    public void setGameDt(LocalDateTime gameDt) {
        this.gameDt = gameDt;
    }

    public String getGameLocal() {
        return gameLocal;
    }

    public void setGameLocal(String gameLocal) {
        this.gameLocal = gameLocal;
    }

    public Integer getGameCnt() {
        return gameCnt;
    }

    public void setGameCnt(Integer gameCnt) {
        this.gameCnt = gameCnt;
    }

    public LocalDateTime getGameStime() {
        return gameStime;
    }

    public void setGameStime(LocalDateTime gameStime) {
        this.gameStime = gameStime;
    }

    public LocalDateTime getGameEtime() {
        return gameEtime;
    }

    public void setGameEtime(LocalDateTime gameEtime) {
        this.gameEtime = gameEtime;
    }

    public String getGamePlayTime() {
        return gamePlayTime;
    }

    public void setGamePlayTime(String gamePlayTime) {
        this.gamePlayTime = gamePlayTime;
    }

    public String getGameDoubleAt() {
        return gameDoubleAt;
    }

    public void setGameDoubleAt(String gameDoubleAt) {
        this.gameDoubleAt = gameDoubleAt;
    }

    public String getGameHomeNm() {
        return gameHomeNm;
    }

    public void setGameHomeNm(String gameHomeNm) {
        this.gameHomeNm = gameHomeNm;
    }

    public String getGameAwayNm() {
        return gameAwayNm;
    }

    public void setGameAwayNm(String gameAwayNm) {
        this.gameAwayNm = gameAwayNm;
    }

    public String getGameHomeResult() {
        return gameHomeResult;
    }

    public void setGameHomeResult(String gameHomeResult) {
        this.gameHomeResult = gameHomeResult;
    }

    public String getGameAwayResult() {
        return gameAwayResult;
    }

    public void setGameAwayResult(String gameAwayResult) {
        this.gameAwayResult = gameAwayResult;
    }

    public String getGameCancelTy() {
        return gameCancelTy;
    }

    public void setGameCancelTy(String gameCancelTy) {
        this.gameCancelTy = gameCancelTy;
    }
}
