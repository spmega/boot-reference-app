package com.vpath.em.service;

import com.vpath.em.model.Rating;

public interface ReviewsSummary {

	long getNumberOfReviewsWithRating(Rating rating);

}
