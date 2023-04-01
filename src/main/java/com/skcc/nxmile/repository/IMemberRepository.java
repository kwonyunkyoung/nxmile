package com.skcc.nxmile.repository;

import com.skcc.nxmile.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;


public interface IMemberRepository extends JpaRepository<Member, Long> {

}
