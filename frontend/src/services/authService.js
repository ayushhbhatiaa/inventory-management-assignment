// import api from "./api.js";

import api from "./api.js";

export const login = (credentials) => {
  return api.post("/auth/login", credentials);
};