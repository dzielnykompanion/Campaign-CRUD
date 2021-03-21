package com.golabek.campaignapp.repository;

import com.golabek.campaignapp.model.Keyword;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KeywordRepo extends JpaRepository<Keyword, Long> {
}
