package com.coderscampus.repository;

import com.coderscampus.domain.MyTableRowThing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyTableRowThingRepository extends JpaRepository<MyTableRowThing, Long> {
}
