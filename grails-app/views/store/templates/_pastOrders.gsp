<table class="table sortable">
	<thead>
		<tr>
			<th data-defaultsort="asc">Scheduled Pickup Time</th>
			<th data-defaultsort="disabled">Items</th>
			<th>Total</th>
			<storeTag:orderActionsHeader addActionsHeader="${addActions}"/>
		</tr>
	</thead>
	<tbody>
		<storeTag:pastOrders orders="${orders}" addActionButtons="${addActions}"/>
	</tbody>
</table>