// import api from "/.api.js";

import api from "./api.js";

export const getAllProducts = () => {
    return api.get("/products/getAllProducts");
};

export const addProduct = (product) => {
    return api.post("/products/addProduct", product);
};

export const updateProduct = (id, product) => {
    return api.put(`/products/updateProduct/${id}`, product);
};

export const deleteProduct = (id) => {
    return api.delete(`/products/deleteProduct/${id}`);
};