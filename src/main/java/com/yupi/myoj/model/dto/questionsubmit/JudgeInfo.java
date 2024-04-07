package com.yupi.myoj.model.dto.questionsubmit;

import lombok.Data;

//判题信息

@Data
public class JudgeInfo {

    /**
     * 程序执行信息
     */
    private String message;

    /**
     * 内存消耗
     */
    private Long memory;

    /**
     * 时间消耗
     */
    private Long time;
}
