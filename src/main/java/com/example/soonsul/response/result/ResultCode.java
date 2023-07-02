package com.example.soonsul.response.result;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultCode {
    // user
    NEW_USER_LOGIN_SUCCESS(200, "A001", "신규 유저 로그인 완료했습니다."),
    ORIGINAL_USER_LOGIN_SUCCESS(200, "A002", "기존 유저 로그인 완료했습니다."),
    SIGNUP_SUCCESS(201,"A003","회원가입 완료했습니다."),
    GENERATE_ACCESS_TOKEN_SUCCESS(200,"A004","새로운 Access Token을 발급했습니다."),
    TOKEN_VALID_CHECK_SUCCESS(200,"A005","Access Token 유효성 검사 완료했습니다."),

    //scan
    GET_SCANNED_LIQUOR_NAME_SUCCESS(200,"S001","스캔한 제품의 주류명을 조회했습니다."),

    //liquor
    GET_LIQUOR_INFO_SUCCESS(200,"L001","전통주 정보를 조회했습니다."),
    GET_EVALUATION_CHECK_SUCCESS(200,"L002","전통주 평가 여부를 조회했습니다."),
    GET_FLAVOR_AVERAGE_SUCCESS(200,"L003","전통주 전체 맛평가를 조회했습니다."),
    GET_FLAVOR_PERSON_SUCCESS(200,"L004","전통주 개인 맛평가를 조회했습니다."),
    GET_FLAVOR_CHECK_SUCCESS(200,"L005","전통주 맛평가 여부를 조회했습니다."),
    GET_REVIEW_LIST_SUCCESS(200,"L006","전통주 전체 리뷰를 조회했습니다."),
    GET_REVIEW_SUCCESS(200,"L007","전통주 리뷰 한개를 조회했습니다."),
    GET_COMMENT_LIST_SUCCESS(200,"L008","해당하는 리뷰의 전체 댓글을 조회했습니다."),
    POST_EVALUATION_SUCCESS(201,"L009","전통주에 대한 평가를 등록했습니다."),
    PUT_EVALUATION_SUCCESS(200,"L010","전통주에 대한 평가를 수정했습니다."),
    POST_COMMENT_SUCCESS(201,"L011","댓글을 등록했습니다."),
    PUT_COMMENT_SUCCESS(200,"L012","댓글을 수정했습니다."),
    DELETE_COMMENT_SUCCESS(200,"L013","댓글을 삭제했습니다."),
    POST_RECOMMENT_SUCCESS(201,"L014","대댓글을 등록했습니다."),
    PUT_RECOMMENT_SUCCESS(200,"L015","대댓글을 수정했습니다."),
    DELETE_RECOMMENT_SUCCESS(200,"L016","대댓글을 삭제했습니다."),
    POST_REVIEW_LIKE_SUCCESS(200,"L017","해당 리뷰의 좋아요를 추가했습니다."),
    DELETE_REVIEW_LIKE_SUCCESS(200,"L018","해당 리뷰의 좋아요를 삭제했습니다."),
    GET_REVIEW_LIKE_SUCCESS(200,"L019","해당 리뷰의 좋아요를 조회했습니다."),
    POST_COMMENT_LIKE_SUCCESS(200,"L020","해당 댓글의 좋아요를 추가했습니다."),
    DELETE_COMMENT_LIKE_SUCCESS(200,"L021","해당 댓글의 좋아요를 삭제했습니다."),
    GET_COMMENT_LIKE_SUCCESS(200,"L022","해당 댓글의 좋아요를 조회했습니다."),
    GET_WEEK_LIQUOR_SUCCESS(200,"L023","이번주 가장 사랑받는 전통주를 조회했습니다."),
    ;


    private final int status;
    private final String code;
    private final String message;
}