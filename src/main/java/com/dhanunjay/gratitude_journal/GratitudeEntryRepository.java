package com.dhanunjay.gratitude_journal;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GratitudeEntryRepository extends JpaRepository<GratitudeEntity,Long>{
    
} 