package org.gxun.homework.manager.core.api.dto;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

public class PagingRespDTO<T> extends Page<T> {

    @Override
    public long getPages() {
        if (this.getSize() == 0L) {
            return 0L;
        } else {
            long pages = this.getTotal() / this.getSize();
            if (this.getTotal() % this.getSize() != 0L) {
                ++pages;
            }
            return pages;
        }
    }

}
