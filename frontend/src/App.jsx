import { Routes, Route, Navigate } from "react-router-dom";

import Login from "./pages/Login/Login";
import Dashboard from "./pages/Dashboard/Dashboard";
import Products from "./pages/Products/Products";
import Employees from "./pages/Employees/Employees";
import Requests from "./pages/Requests/Requests";

function App() {
  return (
    <Routes>
      <Route path="/" element={<Navigate to="/login" />} />

      <Route path="/login" element={<Login />} />

      <Route path="/dashboard" element={<Dashboard />} />

      <Route path="/products" element={<Products />} />

      <Route path="/employees" element={<Employees />} />

      <Route path="/requests" element={<Requests />} />
    </Routes>
  );
}

export default App;
