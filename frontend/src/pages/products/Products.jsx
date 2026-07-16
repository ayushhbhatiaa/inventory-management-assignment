import { useEffect, useState } from "react";

import Layout from "../../components/Layout/Layout";

import { getAllProducts } from "../../services/productService";

function Products() {
  const [products, setProducts] = useState([]);

  useEffect(() => {
    loadProducts();
  }, []);

  const loadProducts = () => {
    getAllProducts().then((res) => {
      setProducts(res.data);
    });
  };

  return (
    <Layout>
      <h2>Products</h2>

      <hr />

      <table className="table table-striped">
        <thead>
          <tr>
            <th>ID</th>

            <th>Name</th>

            <th>Category</th>

            <th>Price</th>

            <th>Quantity</th>
          </tr>
        </thead>

        <tbody>
          {products.map((product) => (
            <tr key={product.productId}>
              <td>{product.productId}</td>

              <td>{product.productName}</td>

              <td>{product.category}</td>

              <td>{product.price}</td>

              <td>{product.quantity}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </Layout>
  );
}

export default Products;
