package io.cloudtype.waitlist.repository;

import io.cloudtype.waitlist.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Long> {

}
