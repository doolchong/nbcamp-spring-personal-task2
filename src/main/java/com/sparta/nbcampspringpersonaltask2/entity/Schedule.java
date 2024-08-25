package com.sparta.nbcampspringpersonaltask2.entity;

import com.sparta.nbcampspringpersonaltask2.dto.ScheduleRequestDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "schedules")
@NoArgsConstructor
public class Schedule extends Timestamped {

    @Id
    @Column(name = "schedule_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scheduleId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "schedule_title")
    private String scheduleTitle;

    @Column(name = "schedule_content", length = 500)
    private String scheduleContent;

    @OneToMany(mappedBy = "schedule", cascade = CascadeType.REMOVE)
    private List<Comment> comments = new ArrayList<Comment>();

    public Schedule(ScheduleRequestDto scheduleRequestDto) {
        this.userId = scheduleRequestDto.getUserId();
        this.scheduleTitle = scheduleRequestDto.getScheduleTitle();
        this.scheduleContent = scheduleRequestDto.getScheduleContent();
    }

    public void updateSchedule(ScheduleRequestDto scheduleRequestDto) {
        this.userId = scheduleRequestDto.getUserId();
        this.scheduleTitle = scheduleRequestDto.getScheduleTitle();
        this.scheduleContent = scheduleRequestDto.getScheduleContent();
    }
}
