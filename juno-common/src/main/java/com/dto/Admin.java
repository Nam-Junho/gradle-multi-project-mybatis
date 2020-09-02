package com.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 관리자 VO
 */
@Data
public class Admin implements Serializable {

    /** UID */
    private static final long serialVersionUID = -9131216295853872807L;

    /** 아이디 */
    private Long id;

    /** LDAP 계정 */
    private String account;

    /** 이름 */
    private String name;

    /** 관리자 형태(일반 관리자, 사이트 관리자) */
    private String role;

    /** 법인 코드*/
    private String corporationCode;

    /** 공동체명 */
    private String corporation;

    /** 부서명 */
    private String department;

    /** 로그인 실패 횟수 */
    private int loginFailureCount;

    /** 최근 로그인 실패 일시 */
    private LocalDateTime latestFailureDateTime;

    /** 최근 로그인 일시 */
    private LocalDateTime latestLoginDateTime;

    /** 활성여부 */
    private boolean enable;

    /** 사용 시작 일자 */
    private LocalDate fromDate;

    /** 사용 종료 일자 */
    private LocalDate toDate;

    /** 사용목적 */
    private String purpose;

    /** 삭제상태 */
    private boolean delete;

    /** 식별자 */
    private String uuid;
}
