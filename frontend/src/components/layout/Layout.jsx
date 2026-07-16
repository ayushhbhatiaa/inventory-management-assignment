import Navbar from "../Navbar/Navbar";

import "./Layout.css";

function Layout({ children }) {
  return (
    <>
      <Navbar />

      <div className="layout">{children}</div>
    </>
  );
}

export default Layout;
