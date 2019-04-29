package org.superbiz.moviefun.podcast;

import org.springframework.data.repository.CrudRepository;
import org.superbiz.moviefun.podcast.Podcast;

import java.util.Optional;

public interface PodcastRepository extends CrudRepository<Podcast, Long> {

    Optional<Podcast> findById(Long id);
}
