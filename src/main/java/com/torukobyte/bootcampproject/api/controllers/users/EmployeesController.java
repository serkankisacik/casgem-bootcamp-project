package com.torukobyte.bootcampproject.api.controllers.users;

import com.torukobyte.bootcampproject.business.abstracts.users.EmployeeService;
import com.torukobyte.bootcampproject.business.constants.Paths;
import com.torukobyte.bootcampproject.business.dto.requests.users.employees.CreateEmployeeRequest;
import com.torukobyte.bootcampproject.business.dto.requests.users.employees.UpdateEmployeeRequest;
import com.torukobyte.bootcampproject.business.dto.responses.users.employees.CreateEmployeeResponse;
import com.torukobyte.bootcampproject.business.dto.responses.users.employees.GetAllEmployeeResponse;
import com.torukobyte.bootcampproject.business.dto.responses.users.employees.GetEmployeeResponse;
import com.torukobyte.bootcampproject.business.dto.responses.users.employees.UpdateEmployeeResponse;
import com.torukobyte.bootcampproject.core.util.results.DataResult;
import com.torukobyte.bootcampproject.core.util.results.Result;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@AllArgsConstructor
@RequestMapping(Paths.api + "employees")
public class EmployeesController {
    private EmployeeService service;

    @GetMapping
    DataResult<List<GetAllEmployeeResponse>> getAll() {
        return service.getAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    DataResult<CreateEmployeeResponse> add(@RequestBody CreateEmployeeRequest request) {
        return service.add(request);
    }

    @GetMapping("/{id}")
    DataResult<GetEmployeeResponse> getById(@PathVariable int id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    DataResult<UpdateEmployeeResponse> update(@RequestBody UpdateEmployeeRequest request, @PathVariable int id) {
        return service.update(request, id);
    }

    @DeleteMapping("/{id}")
    Result delete(@PathVariable int id) {
        return service.delete(id);
    }
}
