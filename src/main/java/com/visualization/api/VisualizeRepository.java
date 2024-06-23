package com.visualization.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisualizeRepository extends JpaRepository<Visualize, Long> {

}
