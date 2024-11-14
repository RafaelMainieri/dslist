package com.devsuperior.dslist.projections;

import com.devsuperior.dslist.entities.Belonging;

public interface GameMinProjection {

    Long getId();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
}
