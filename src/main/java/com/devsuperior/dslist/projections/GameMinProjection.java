package com.devsuperior.dslist.projections;

import com.devsuperior.dslist.entities.Belonging;

public interface GameMinProjection {

    Long getId();
    String getTitle();
    Integer getGameYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
}
