package com.moxi.mogublog.xo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.moxi.mogublog.commons.entity.Picture;
import com.moxi.mogublog.xo.vo.PictureVO;
import com.moxi.mougblog.base.service.SuperService;

/**
 * <p>
 * 图片表 服务类
 * </p>
 *
 * @author xuzhixiang
 * @since 2018年9月17日16:17:22
 */
public interface PictureService extends SuperService<Picture> {

    /**
     * 获取图片列表
     *
     * @param pictureVO
     * @return
     */
    public IPage<Picture> getPageList(PictureVO pictureVO);

    /**
     * 新增图片
     *
     * @param pictureVO
     */
    public String addPicture(PictureVO pictureVO);

    /**
     * 编辑图片
     *
     * @param pictureVO
     */
    public String editPicture(PictureVO pictureVO);

    /**
     * 批量删除图片
     *
     * @param pictureVO
     */
    public String deleteBatchPicture(PictureVO pictureVO);

    /**
     * 设置图片封面
     *
     * @param pictureVO
     */
    public String setPictureCover(PictureVO pictureVO);
}
