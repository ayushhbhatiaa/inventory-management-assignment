import Layout from "../../components/Layout/Layout";

function Dashboard() {
  const username = localStorage.getItem("username");
  const role = localStorage.getItem("role");

  return (
    <Layout>
      <h2>Dashboard</h2>

      <h4>Welcome {username}</h4>

      <p>Role : {role}</p>
    </Layout>
  );
}

export default Dashboard;
