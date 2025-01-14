package com.tuk.sportify.crewapplicant.repository;

import com.tuk.sportify.crew.domain.Crew;
import com.tuk.sportify.crewapplicant.domain.CrewApplicant;
import com.tuk.sportify.member.domain.Member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CrewApplicantRepository extends JpaRepository<CrewApplicant, Long> {

    @Query(
            "select ca from CrewApplicant ca join fetch ca.member join fetch ca.crew cac join "
                    + "fetch cac.sportVoucher where ca.id "
                    + "=:applicantId")
    Optional<CrewApplicant> findByIdJoinFetch(Long applicantId);

    boolean existsByMemberAndCrew(Member member, Crew crew);
}
