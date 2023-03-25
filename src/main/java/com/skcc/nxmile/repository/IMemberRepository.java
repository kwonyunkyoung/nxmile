package com.skcc.nxmile.repository;

import com.skcc.nxmile.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IMemberRepository extends JpaRepository<Member, Long> {

}
