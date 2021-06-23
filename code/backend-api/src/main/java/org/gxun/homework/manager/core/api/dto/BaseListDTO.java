package org.gxun.homework.manager.core.api.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class BaseListDTO<T> implements Serializable {

    @JsonIgnore
    private String userId;

    /**
     * 数据列表
     */
    private List<T> items;
}
