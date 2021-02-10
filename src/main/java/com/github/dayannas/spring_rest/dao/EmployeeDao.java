package com.github.dayannas.spring_rest.dao;

import com.github.dayannas.spring_rest.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    /**
     * Получение списка работников из БД
     * @return список работников
     */
    public List<Employee> getAllEmployees();

    /**
     * Сохранение работника в БД
     * @param employee работник
     */
    public void saveEmployee(Employee employee);

    /**
     * Получение работника из БД
     * @param id ИД работника
     * @return работник
     */
    public Employee getEmployee(int id);

    /**
     * Удаление работника из БД
     * @param id ИД работника
     */
    public void deleteEmployee(int id);
}
