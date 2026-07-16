import { NavLink, useNavigate } from "react-router-dom";

import "./Navbar.css";

function Navbar() {
  const navigate = useNavigate();

  const username = localStorage.getItem("username");
  const role = localStorage.getItem("role");

  const logout = () => {
    localStorage.clear();
    navigate("/login");
  };

  return (
    <div className="navbar-container">
      <div className="logo">InventoryFlow</div>

      <div className="nav-links">
        <NavLink to="/dashboard">Dashboard</NavLink>

        <NavLink to="/products">Products</NavLink>

        <NavLink to="/employees">Employees</NavLink>

        <NavLink to="/requests">Requests</NavLink>
      </div>

      <div className="user-info">
        <div>{username}</div>

        <small>{role}</small>

        <button onClick={logout}>Logout</button>
      </div>
    </div>
  );
}

export default Navbar;
