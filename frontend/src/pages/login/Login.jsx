import { useState } from "react";
import { useNavigate } from "react-router-dom";
import { login } from "../../services/authService";

function Login() {
  const navigate = useNavigate();

  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");

  const handleLogin = async (e) => {
    e.preventDefault();

    try {
      const response = await login({
        username,
        password,
      });

      localStorage.setItem("token", response.data.token);
      localStorage.setItem("username", response.data.username);
      localStorage.setItem("role", response.data.role);

      navigate("/dashboard");
    } catch (err) {
      alert("Invalid Username or Password");
    }
  };

  return (
    <div
      className="d-flex justify-content-center align-items-center vh-100"
      style={{
        backgroundColor: "#2F343B",
      }}
    >
      <div
        className="card shadow border-0"
        style={{
          width: "500px",
          backgroundColor: "#F5F7FA",
          borderRadius: "12px",
        }}
      >
        <div className="card-body p-4">
          <h2
            className="text-center fw-bold mb-4"
            style={{
              color: "#1E293B",
            }}
          >
            Inventory Flow
          </h2>

          <form
            onSubmit={handleLogin}
            className="d-flex flex-column align-items-center"
          >
            <input
              type="text"
              className="form-control mb-3"
              placeholder="Username"
              value={username}
              onChange={(e) => setUsername(e.target.value)}
              style={{
                width: "380px",
                height: "45px",
              }}
            />

            <input
              type="password"
              className="form-control mb-4"
              placeholder="Password"
              value={password}
              onChange={(e) => setPassword(e.target.value)}
              style={{
                width: "380px",
                height: "45px",
              }}
            />

            <button
              className="btn btn-primary"
              style={{
                width: "380px",
                height: "45px",
              }}
            >
              Login
            </button>
          </form>

          <hr className="my-4" />

          <h6 className="text-center text-secondary mb-3">Demo Accounts</h6>

          <div className="row text-center">
            <div className="col">
              <div className="fw-bold">ADMIN</div>

              <small className="text-muted">Username : admin</small>

              <br />

              <small className="text-muted">Password : admin123</small>
            </div>

            <div className="col">
              <div className="fw-bold">CREATOR</div>

              <small className="text-muted">Username : creator</small>

              <br />

              <small className="text-muted">Password : creator123</small>
            </div>

            <div className="col">
              <div className="fw-bold">PURCHASER</div>

              <small className="text-muted">Username : purchaser</small>

              <br />

              <small className="text-muted">Password : purchaser123</small>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}

export default Login;
