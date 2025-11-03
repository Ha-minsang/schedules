package com.example.schedules.repository;

import com.example.schedules.entity.Schedule;
import org.springframework.data.repository.CrudRepository;

public interface ScheduleRepository extends CrudRepository<Schedule, Long> {

}
