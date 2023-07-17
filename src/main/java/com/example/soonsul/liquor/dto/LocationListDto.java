package com.example.soonsul.liquor.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "전통주 - 소재지 정보")
public class LocationListDto {

    @ApiModelProperty(value = "소재지 pk")
    private Long locationInfoId;

    @ApiModelProperty(value = "소재지 이름")
    private String name;

    @ApiModelProperty(value = "위도")
   private Integer latitude;

    @ApiModelProperty(value = "경도")
    private Integer longitude;

    @ApiModelProperty(value = "양조장")
    private String brewery;

}
