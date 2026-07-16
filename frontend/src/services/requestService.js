import api from "./api.js";

export const getAllRequests = () => {
    return api.get("/inventoryRequests/getAllRequests");
};

export const addRequest = (request) => {
    return api.post("/inventoryRequests/addRequest", request);
};

export const updateRequest = (id, request) => {
    return api.put(`/inventoryRequests/updateRequest/${id}`, request);
};

export const deleteRequest = (id) => {
    return api.delete(`/inventoryRequests/deleteRequest/${id}`);
};