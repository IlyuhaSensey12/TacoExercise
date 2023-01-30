package com.example.demo.data;

import com.example.demo.TacoOrder;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

}
