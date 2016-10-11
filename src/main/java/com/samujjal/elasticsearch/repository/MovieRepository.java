package com.samujjal.elasticsearch.repository;

import com.samujjal.elasticsearch.document.Movie;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by samujjal on 18/09/16.
 */
public interface MovieRepository extends ElasticsearchRepository<Movie, String> {

}
