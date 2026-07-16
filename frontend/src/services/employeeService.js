import api from "./api";

export const getAllEmployees = () => {
    return api.get("/employees/getAllEmployees");
};

export const addEmployee = (employee) => {
    return api.post("/employees/addEmployee", employee);
};

export const updateEmployee = (id, employee) => {
    return api.put(`/employees/updateEmployee/${id}`, employee);
};

export const deleteEmployee = (id) => {
    return api.delete(`/employees/deleteEmployee/${id}`);
};