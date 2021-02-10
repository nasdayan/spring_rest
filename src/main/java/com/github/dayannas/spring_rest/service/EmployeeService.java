package com.github.dayannas.spring_rest.service;

import com.github.dayannas.spring_rest.entity.Employee;

import java.util.List;

public interface EmployeeService {

    /**
     * Возврат списка работников из DAO
     * @return список работников из DAO
     */
    public List<Employee> getAllEmployees();

    /**
     * Сохранение работника в DAO
     * @param employee работник
     */
    public void saveEmployee(Employee employee);

    /**
     * Получение работника из DAO
     * @param id ИД работника
     * @return Работник
     */
    public Employee getEmployee(int id);

    /**
     * Удаление работника из DAO
     * @param id ИД работника
     */
    public void deleteEmployee(int id);
}
