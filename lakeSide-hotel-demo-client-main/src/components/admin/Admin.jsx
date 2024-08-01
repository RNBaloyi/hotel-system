import React from "react";
import { Link } from "react-router-dom";

const Admin = () => {
	return (
		<section className="container mt-5 shadow p-4 bg-white rounded">
			<h2 className="mb-4">Welcome to Admin Panel</h2>
			<hr />
			<div className="d-flex justify-content-start gap-2">
				<Link to="/existing-rooms" className="btn btn-primary">
					Manage Rooms
				</Link>
				<Link to="/existing-bookings" className="btn btn-primary">
					Manage Bookings
				</Link>
			</div>

		</section>
	);
};

export default Admin;
