package com.vpath.em.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.vpath.em.model.City;
import com.vpath.em.model.Hotel;
import com.vpath.em.model.Review;
import com.vpath.em.model.ReviewDetails;

public interface HotelService {

	Hotel getHotel(City city, String name);

	Page<Review> getReviews(Hotel hotel, Pageable pageable);

	Review getReview(Hotel hotel, int index);

	Review addReview(Hotel hotel, ReviewDetails details);

	ReviewsSummary getReviewSummary(Hotel hotel);

}
