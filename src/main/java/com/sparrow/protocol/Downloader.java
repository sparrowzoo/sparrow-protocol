package com.sparrow.protocol;

public interface Downloader {
    Long downloadImage(String imageUrl, Long authorId) throws BusinessException;
}
